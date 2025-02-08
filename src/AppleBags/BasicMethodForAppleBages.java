package AppleBags;

public class BasicMethodForAppleBages {
    // Assume we only have bages that can contain 6 or 8 apples
    // 6 个袋子的只能装 6 个不能多不能少, 8 个的同理
    public int minBags(int apple ){
        if (apple < 0){
            return -1;
        }
        int bag6 =-1;
        int bag8 = apple/8;
        int left = apple - 8* bag8;
        // 24 是 8 和 6 的最小公倍数
        while (bag8>=0 && left < 24){
            int resutUse6 = minBageBase6(left);
            if (resutUse6 != -1){
                bag6 = resutUse6;
                break;
            }
            left = apple - 8 * (--bag8);
        }
        if ( bag6 == -1){
            return -1;
        }
        else {
            return bag8 + bag6;
        }
    }
    private int minBageBase6(int left){
        if (left % 6 == 0){
            return left /6;
        }
        else{
            return -1;
        }
    }
}
