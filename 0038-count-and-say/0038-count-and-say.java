class Solution {
     private static final Map<Integer, String> resultsCache = new HashMap<>();

        public String countAndSay(int n) {
            if(resultsCache.containsKey(n)) {
                return resultsCache.get(n);
            }

            if (n == 1) {
                return "1";
            }

            String result = say(countAndSay(n - 1));
            resultsCache.put(n, result);
            return  result;
        }

        private String say(String number) {
            int currentIndex = 0;
            StringBuilder result = new StringBuilder();
            while (currentIndex <= number.length() - 1) {
                int nextIndex = findNextDifferentIndex(number, currentIndex);

                result.append(nextIndex - currentIndex);
                result.append(number.charAt(currentIndex));

                currentIndex = nextIndex;
            }

            return result.toString();
        }

        private int findNextDifferentIndex(String number, int index) {
            char currentDigit = number.charAt(index);
            int currentIndex = index;
            while (currentIndex <= number.length() -1) {
                currentIndex = currentIndex + 1;
                if (currentIndex == number.length() || currentDigit != number.charAt(currentIndex)) {
                    return currentIndex;
                }
            }

            return number.length() - 1;
        }
}