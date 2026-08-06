class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = Integer.MIN_VALUE;

        // Find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int res = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = calculateHours(piles, mid);

            if (hours > h) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }

        return res;
    }

    public long calculateHours(int[] piles, int speed) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1L) / speed; // ceil(pile / speed)
        }

        return hours;
    }
}
