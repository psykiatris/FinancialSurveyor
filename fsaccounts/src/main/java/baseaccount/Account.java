package baseaccount;

public record Account(String name, double prin, double rate, int term) {

    // Canonical constructor
    public Account(String name, double prin, double rate, int term) {
        this.name = name.trim();
        this.prin = prin;
        this.rate = rate;
        this.term = term;

    }

    // Non-canonical construcor
    //public Account(double prin, double rate) {
      // this(name, prin, rate, term);
    //}
}
