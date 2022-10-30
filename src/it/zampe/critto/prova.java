package it.zampe.critto;

public class prova {

    public static void main(String[] args) {
        Text t = new Text(new int[]{0x81, 0x4c, 0x55, 0x66, 0x43, 0xee, 0x33, 0xa5
        , 0x44, 0x31, 0x12, 0x3e, 0x7e, 0x4e, 0x10, 0x00});
        t.subByte();
        System.out.println(t.toString());
        t.shiftRows();
        System.out.println(t.toString());
    }
}