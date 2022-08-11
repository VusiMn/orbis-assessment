class SetGames{

  // sets care about games won
  val minimumGamesWonMargin = 2
  val maximumGamesWon = 6

  def setWon(playOneGamesWon: Int, playTwoGamesWon: Int) : Boolean = {
     playOneGamesWon >= maximumGamesWon && (playOneGamesWon - playTwoGamesWon) > minimumGamesWonMargin
  }

}
