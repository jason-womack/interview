package com.placeable.interview

import com.placeable.testspec.utils._

class CapitalCheckSpec extends UnitSpec {

  val ALL_CAPZ = Array('A','L','L','C','A','P','Z')
  val Not_All_Capz = Array('N','o','t','A','l','l','C','a','p','z')

  "Capital Check 1" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck1(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck1(Not_All_Capz))
  }

  "Capital Check 2" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck2(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck2(Not_All_Capz))
  }

  "Capital Check 3" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck3(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck3(Not_All_Capz))
  }

  "Capital Check 4" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck4(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck4(Not_All_Capz))
  }

  "Capital Check 5" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck5(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck5(Not_All_Capz))
  }

  "Capital Check 6" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck6(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck6(Not_All_Capz))
  }

  "Capital Check 7" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck7(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck7(Not_All_Capz))
  }

  "Capital Check 8" should "return true for ALL_CAPZ" in {
    assert(CapitalCheck.capitalCheck8(ALL_CAPZ))
  }

  it should "return false for Not_All_Capz" in {
    assert(!CapitalCheck.capitalCheck8(Not_All_Capz))
  }

}
