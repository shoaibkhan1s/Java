

public class powerOfNumber {
public static void main(String[] args) {
    int n = 4;
    int ans = 0;
    int base =5;
    while (n>0) {
        int lastBit = (n&1);
        base = base*lastBit;
ans += base;
        n = n >> 1;
}
}
}
