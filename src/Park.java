public class Park {
    public static class Attraction {
        private String attractionName;
        private String workingTime;
        private int cost;

        public Attraction(String attractionName, String workingTime, int cost) {
            this.attractionName = attractionName;
            this.workingTime = workingTime;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction " + attractionName + ", workingTime: " + workingTime + ", cost: " + cost;
        }
    }

}
