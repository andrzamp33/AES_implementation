package it.zampe.critto;

public class prova {

    public static void main(String[] args) {
        Text t = new Text(new int[]{0x19, 0xa0, 0x9a, 0xe9, 0x3d, 0xf4, 0xc6, 0xf8
        , 0xe3, 0xe2, 0x8d, 0x48, 0xbe, 0x2b, 0x2a, 0x08});
        t.subByte();
        System.out.println(t.toString());
        t.shiftRows();
        System.out.println(t.toString());
        t.mixColumns();
        System.out.println(t.toString());
    }
}