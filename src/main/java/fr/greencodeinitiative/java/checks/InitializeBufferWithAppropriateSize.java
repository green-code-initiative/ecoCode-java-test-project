package fr.greencodeinitiative.java.checks;

class InitializeBufferWithAppropriateSize {
	InitializeBufferWithAppropriateSize(InitializeBufferWithAppropriateSize mc) {
	}

	public void testBufferCompliant() {
		StringBuffer stringBuffer = new StringBuffer(16);
	}

	public void testBufferCompliant2() {
		StringBuffer stringBuffer = new StringBuffer(Integer.valueOf(16));
	}

	public void testBufferNonCompliant() {
		StringBuffer stringBuffer = new StringBuffer(); // Noncompliant
	}

	public void testBuilderCompliant() {
		StringBuilder stringBuilder = new StringBuilder(16);
	}

	public void testBuilderNonCompliant() {
		StringBuilder stringBuilder = new StringBuilder(); // Noncompliant
	}
}