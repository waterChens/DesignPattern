package com.water.state;

public class RaffleActivity {
    State state;
    int count;
    DispenseOutState dispenseOutState = new DispenseOutState(this);
    DispenseState dispenseState = new DispenseState(this);
    NoRaffleState noRaffleState = new NoRaffleState(this);
    CanRaffleState canRaffleState = new CanRaffleState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void deductMoney(){
        state.deduceMoney();
    }
    //如果中奖了就可以去领奖
    public void raffle(){
        if (state.raffle()){
            state.dispensePrize();
        }
    }




    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount =count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DispenseOutState getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(DispenseOutState dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(NoRaffleState noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(CanRaffleState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }
}
