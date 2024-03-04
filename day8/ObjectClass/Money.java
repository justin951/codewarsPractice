package day8.ObjectClass;

public class Money {
  int amount;
  String currencyCode;

  public Money(int amount, String currencyCode) {
    this.amount = amount;
    this.currencyCode = currencyCode;
  }

  Money income = new Money(55, "USD");
  Money expenses = new Money(55, "USD");
  boolean balanced = income.equals(expenses);

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Money))
      return false;
    Money other = (Money) o;
    boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null) ||
        (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
    return this.amount == other.amount && currencyCodeEquals;
  }
}
