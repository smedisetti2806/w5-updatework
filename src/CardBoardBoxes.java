public class CardBoardBoxes {
    Dispatched Dispatched;
    Delivered Delivered;
    boxOrder Order;

    State box;
    int count = 0;

    public CardBoardBoxes() {
        Order = new boxOrder(this);
        Dispatched = new Dispatched(this);
        Delivered = new Delivered(this);
        box = Order;
    }

    public void Completed() {
        box.Ready();
    }

    public void Not_Completed() {
        box.Not_Ready();
    }

    public State getBox() {
        return box;
    }

    public void setBox(State box) {
        this.box = box;
    }

    public State getOrder() {
        return Order;
    }

    public State getDispatch() {
        return Dispatched;
    }

    public State getDeliver() {
        return Delivered;
    }

    public int getCount() {
        return count;
    }

    //To String Method
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---Welcome To CardBoard Boxes Factory---");
        if (count != 1) {
            result.append("");
        }
        result.append("\n");
        return result.toString();
    }
}
