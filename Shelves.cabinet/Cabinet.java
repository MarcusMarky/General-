public class Cabinet {
    
    private Thing topShelf;
    private Thing middleShelf;
    private Thing bottomShelf;
//HW1P1:   
    public Cabinet () {

    }
//HW1P2:
public Thing whatIsOn( String shelfName ) {
    if (shelfName.equals("TopShelf")) {
          return topShelf;
    } else if (shelfName.equals("MiddleShelf")) {
          return middleShelf;
    } else if (shelfName.equals("BottomShelf")) {
          return bottomShelf;
    } else {
    return null;
    }
}
//HW1P3:
public void put(String shelfName, Thing thing) {
    if (shelfName.equals("TopShelf")) {
        topShelf = thing;
    } else if (shelfName.equals("MiddleShelf")) {
        middleShelf = thing;
    } else if (shelfName.equals("BottomShelf")) {
        bottomShelf = thing;
    }
}
//HW1P4:
public Thing take(String shelfName) {
    if (shelfName.equals("TopShelf")) {
        Thing taken = topShelf;
        topShelf = null;
        return taken;
    } else if (shelfName.equals("MiddleShelf")) {
        Thing taken = middleShelf;
        middleShelf = null;
        return taken;
    } else if (shelfName.equals("BottomShelf")) {
        Thing taken = bottomShelf;
        bottomShelf = null;
        return taken;
    }
    return null;
}
public String toString() {

String out = 
"##########|Top Shelf|############\n" +
"#    " + topShelf + "           #\n" +
"##########|Middle Shelf|#########\n" +
"#    " + middleShelf + "        #\n" +
"##########|Bottom Shelf|#########\n" +
"#    " + bottomShelf + "        #\n" +
"#################################";
    return out;
}
}