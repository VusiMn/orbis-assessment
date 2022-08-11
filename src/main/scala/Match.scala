class Match {

  val maximumSets = 3
  val maximumSetsWonMargin = 2

  def matchWon(setScore: Int): Boolean = setScore >= maximumSetsWonMargin

}
