public class SummaryRanges {

    class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    TreeSet<Interval> lookUp;
    int[][] resCache;
    boolean cacheDirty;

    public SummaryRanges() {

        Comparator<Interval> sortInterval = new Comparator<Interval>() {
            @Override
            public int compare(Interval it1, Interval it2) {
                return it1.start - it2.start;
            }
        };
        lookUp = new TreeSet<Interval>(sortInterval);

        resCache = new int[0][2];
        cacheDirty = true;
    }

    public void addNum(int val) {

        Interval itCur = new Interval(val, val);
        if (lookUp.contains(itCur)) return;
        Interval itLower = lookUp.lower(itCur), itHigher = lookUp.higher(itCur);
        if (itLower != null && val <= itLower.end) return;
        if ((itHigher != null && itHigher.start == val + 1) && (itLower != null && val == itLower.end + 1)) {
            itLower.end = itHigher.end;
            lookUp.remove(itHigher);
        }
        else if (itHigher != null && itHigher.start == val + 1) itHigher.start = val;
        else if (itLower != null && val == itLower.end + 1) itLower.end = val;
        else lookUp.add(new Interval(val, val));
        cacheDirty = true;
    }
    public int[][] getIntervals() {

        if (!cacheDirty) return resCache;
        int len = lookUp.size();
        resCache = new int[len][2];
        int i = 0;
        for (Interval curr : lookUp) {
            resCache[i][0] = curr.start;
            resCache[i][1] = curr.end;
            i++;
        }
        cacheDirty = false;
        return resCache;
    }
}