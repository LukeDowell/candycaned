Write code that optimizes the total number of candy canes produced per week given an initial stock of CandyCanePlant plants, producing a new collection of CandyCanePlant objects. The output of your code should also produce the total number of candy canes produced per week with the bred stock.

For example, given the following initial stock:

CandyCanePlant(candyCanesProducedPerWeek = 5)
CandyCanePlant(candyCanesProducedPerWeek = 3)
CandyCanePlant(candyCanesProducedPerWeek = 2)
Your code should inform Santa what his final stock will be, as well as the total production value of said stock. The above example should produce a total production output of
CandyCanePlant(candyCanesProducedPerWeek = 7, hasBred = true)
CandyCanePlant(candyCanesProducedPerWeek = 5, hasBred = true)
CandyCanePlant(candyCanesProducedPerWeek = 4, hasBred = false)
CandyCanePlant(candyCanesProducedPerWeek = 3, hasBred = true)
CandyCanePlant(candyCanesProducedPerWeek = 2, hasBred = true)
and a production value of 19 per week.