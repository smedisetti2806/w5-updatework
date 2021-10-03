public class Delivered implements State{

    CardBoardBoxes box;

    public Delivered(CardBoardBoxes box) {
        this.box = box;
    }

    @Override
    public void Ready() {
        System.out.println("<<On the way to Deliver your CardBoard Box>>");
    }

    @Override
    public void Not_Ready() {
        System.out.println("<<CardBoard Box Delivered!>>");
    }

}
