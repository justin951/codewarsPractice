package day8.ObjectClass;

public class WrongVoucher extends Money {
  private String store;

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof WrongVoucher))
      return false;
    WrongVoucher other = (WrongVoucher) o;
    boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null) ||
        (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
    boolean storeEquals = (this.store == null && other.store == null) ||
        (this.store != null && this.store.equals(other.store));
    return this.amount == other.amount && currencyCodeEquals && storeEquals;
  }
}

// At first glance, the Voucher class and its override for equals() seem to be correct. And both equals() methods behave correctly as long as we compare Money to Money or Voucher to Voucher. But what happens, if we compare these two objects:
// Money cash = new Money(42, "USD");
// WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");

// voucher.equals(cash) => false // As expected.
// cash.equals(voucher) => true // That's wrong.
