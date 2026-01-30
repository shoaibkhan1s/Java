public class dice {
public static void main(String[] args) {
    diceComb("", 4);
    diceWithDiffNumberOfFaces("", 8, 8);
}

static void diceComb(String p,int target){
    if (target==0) {
        System.out.println(p);
        return;
    }

    for (int i = 1; i <= 6 && i<=target; i++) {
        diceComb(p+i,target-i);
    }
}


static void diceWithDiffNumberOfFaces(String p,int target,int noOfFace){
    if (target==0) {
        System.out.println(p);
        return;
    }

    for (int i = 1; i <= noOfFace && i<=target; i++) {
        diceComb(p+i,target-i);
    }
}
}
