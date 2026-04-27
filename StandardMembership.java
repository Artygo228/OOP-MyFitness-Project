public class StandardMembership extends Membership {
    
    private double joiningFee;
    private boolean isFrozen;
    private int friendPasses;

    public StandardMembership(int membershipId, double basePrice, boolean isActive, String startDate, String expiryDate, double joiningFee, boolean isFrozen, int friendPasses) {
        super(membershipId, basePrice, isActive, startDate, expiryDate);
        this.joiningFee = joiningFee;
        this.isFrozen = isFrozen;
        this.friendPasses = friendPasses;
    }

    public double getJoiningFee() {
        return joiningFee;
    }

    public void setJoiningFee(double joiningFee) {
        this.joiningFee = joiningFee;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public int getFriendPasses() {
        return friendPasses;
    }

    public void setFriendPasses(int friendPasses) {
        this.friendPasses = friendPasses;
    }
}