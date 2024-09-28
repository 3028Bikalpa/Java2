class Term {
    private double coefficient;
    private int power;

    public Term(double coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Term multiply(Term t) {
        return new Term(this.coefficient * t.coefficient, this.power + t.power);
    }

    public void addIfSamePower(Term t) {
        if (this.power == t.power) {
            this.coefficient += t.coefficient;
        }
    }

    @Override
    public String toString() {
        if (power == 0) {
            return String.format("%.1f", coefficient);
        } else if (power == 1) {
            return String.format("%.1fx", coefficient);
        } else {
            return String.format("%.1fx^%d", coefficient, power);
        }
    }
}
