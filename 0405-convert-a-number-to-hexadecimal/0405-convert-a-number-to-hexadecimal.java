class Solution {
    public String toHex(int num) {
        int mag = Integer.SIZE - Integer.numberOfLeadingZeros(num);
        int len = Math.max(((mag + 3) / 4), 1);
        char[] hexa = new char[len];
        int digit;
        do{
            digit = num & 0xf;
            hexa[--len] = digit < 10 ? (char)(digit + 48) : (char)(digit + 87);
            num >>>= 4;
        }while(num != 0);
        return new String(hexa);
    }
}