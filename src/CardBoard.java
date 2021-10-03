public class CardBoard {
    public static void main(String[] args) {
        CardBoardBoxes box = new CardBoardBoxes();

        System.out.println(box);
        box.setBox(new boxOrder(box));
        box.Completed();

        box.setBox(new Dispatched(box));
        box.Completed();
        box.Not_Completed();

        box.setBox(new Delivered(box));
        box.Completed();
        box.Not_Completed();

        box.setBox(new boxOrder(box));
        box.Not_Completed();
    }
}
