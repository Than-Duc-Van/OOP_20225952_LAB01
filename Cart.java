package main;
 
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= 20) {
			System.out.println("Your cart is full. Cant add new items");
			System.out.println();
		}
		else {
			int i = this.qtyOrdered;
			this.itemOrdered[i] = disc;
			System.out.println("The disc has been added.");
			this.itemOrdered[i].displayDVDInformation();
			this.qtyOrdered++;
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = -1;
		if(this.qtyOrdered < 0) {
			System.out.println("The cart is empty!");
			System.out.println();
		}
		else {
			for(int i = 0; i < this.qtyOrdered; i++) {
				if(this.itemOrdered[i].equals(disc)) {
					index = i;
					break;
				}
			}
			
			if(index != -1) {
				for(int i = index; i < qtyOrdered - 1; i++) {
					this.itemOrdered[i] = this.itemOrdered[i + 1];
				}
				this.itemOrdered[this.qtyOrdered - 1] = null;
				this.qtyOrdered--;
				System.out.println("The disc has been removed.");
				System.out.println();
			}
			
			else {
				System.out.println("The disc is not in the cart!");
				System.out.println();
			}
			
		}
	}
	
	public double totalCost() {
		double sum = 0;
		for(int i = 0; i < this.qtyOrdered; i++) {
			sum += this.itemOrdered[i].getCost();
		}
		return sum;
	}

}