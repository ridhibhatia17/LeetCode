class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;
    Set<Integer> riderS;

    public RideSharingSystem() {
        rider=new LinkedList<>();
        driver=new LinkedList<>();
        riderS=new HashSet<>();
    }
    
    public void addRider(int riderId) {
        rider.offer(riderId);
        riderS.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!rider.isEmpty() && !riderS.contains(rider.peek())){
            rider.poll();
        }
        if(rider.isEmpty()||driver.isEmpty()){
            return new int[]{-1,-1};
        }
        int riderId=rider.poll();
        riderS.remove(riderId);
        int driverId=driver.poll();
        return new int[]{driverId,riderId};
    }
    
    public void cancelRider(int riderId) {
        riderS.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */