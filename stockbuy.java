class stockbuy {

  public int maxProfit(int[] prices) {
    int res = 0;

    int lowest = prices[0];

    for (int j = 1; j < prices.length; j++) {
      if (prices[j] < lowest) {
        lowest = prices[j];
      } else {
        res = Math.max(res, prices[j] - lowest);
      }
    }

    return res;
  }
}
