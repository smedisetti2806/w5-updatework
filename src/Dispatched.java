public class Dispatched implements State{

    CardBoardBoxes box;

    public Dispatched(CardBoardBoxes box) {
        this.box = box;
    }

    @Override
    public void Ready() {
        System.out.println("<<Cardboard Box is packed and dispatched SOON>>");
    }

    @Override
    public void Not_Ready() {
        System.out.println("<<CardBoard Box is dispatched>>");
    }
}
