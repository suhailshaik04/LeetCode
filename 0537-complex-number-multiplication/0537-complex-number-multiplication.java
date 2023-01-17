class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String arr1[] = num1.split("\\+");
        String arr2[] = num2.split("\\+");
        int realPart = 0, imaginaryPart = 0;
        int temp1 = Integer.parseInt(arr1[0]);
        int temp2 = Integer.parseInt(arr1[1].replace("i", ""));
        int temp3 = Integer.parseInt(arr2[0]);
        int temp4 = Integer.parseInt(arr2[1].replace("i", ""));
        realPart = temp1*temp3 - temp2*temp4;
        imaginaryPart = temp1*temp4 + temp2*temp3;
        StringBuilder sb = new StringBuilder();
        sb.append(realPart);
        sb.append("+");
        sb.append(imaginaryPart);
        sb.append("i");
        return sb.toString();
    }
}