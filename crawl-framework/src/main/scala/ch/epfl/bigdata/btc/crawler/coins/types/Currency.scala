package ch.epfl.bigdata.btc.crawler.coins.types

object Currency extends Enumeration {
	type Currency = Value
	val BTC = Value("btc")
	val LTC = Value("ltc")
	val USD = Value("usd")
	val CHF = Value("chf")
	val RUR = Value("rur")
}
