public class boxOrder implements State{
    CardBoardBoxes box;

    public boxOrder(CardBoardBoxes box) {
        this.box = box;
    }

    @Override
    public void Ready() {
        System.out.println("<<Order of CardBoard making is Start>>");
    }

    @Override
    public void Not_Ready() {
        System.out.println("<<Order of CardBoard making Ended>>");
    }
}
