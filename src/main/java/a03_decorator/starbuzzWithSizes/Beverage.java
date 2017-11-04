package a03_decorator.starbuzzWithSizes;

public abstract class Beverage {

	private Size size = Size.TALL;

	public Size getSize() {
		return this.size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

  public abstract String getDescription();

  public abstract double getCost();
}
