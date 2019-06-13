import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrintMagazineTest {
    private val magazine = PrintMagazine(FormatToA4.A6.nbLeaf)
    private val magazineA8 = PrintMagazine(FormatToA4.A8.nbLeaf)

    @Test
    fun checkPageCalculateFor8() {
        Assertions.assertEquals(2, magazine.calculateNumberOfLeaf(8))
    }

    @Test
    fun checkPageCalculateFor10() {
        Assertions.assertEquals(3, magazine.calculateNumberOfLeaf(10))
    }

    @Test
    fun whenMagazineHave5Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,3,5)),
            PageOfMagazine(2, mutableListOf(2,4))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(5))
    }

    @Test
    fun whenMagazineHave6Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,3,5)),
            PageOfMagazine(2, mutableListOf(2,4,6))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(6))
    }

    @Test
    fun whenMagazineHave7Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,3,5,7)),
            PageOfMagazine(2, mutableListOf(2,4,6))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(7))
    }

    @Test
    fun whenMagazineHave8Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,3,5,7)),
            PageOfMagazine(2, mutableListOf(2,4,6,8))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(8))
    }

    @Test
    fun whenMagazineHave9Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,4,7)),
            PageOfMagazine(2, mutableListOf(2,5,8)),
            PageOfMagazine(3, mutableListOf(3,6,9))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(9))
    }

    @Test
    fun whenMagazineHave10Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,4,7,10)),
            PageOfMagazine(2, mutableListOf(2,5,8)),
            PageOfMagazine(3, mutableListOf(3,6,9))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(10))
    }

    @Test
    fun whenMagazineHave11Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,4,7,10)),
            PageOfMagazine(2, mutableListOf(2,5,8,11)),
            PageOfMagazine(3, mutableListOf(3,6,9))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(11))
    }


    @Test
    fun whenMagazineHave12Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,4,7,10)),
            PageOfMagazine(2, mutableListOf(2,5,8,11)),
            PageOfMagazine(3, mutableListOf(3,6,9,12))
        )

        Assertions.assertArrayEquals(result, magazine.getMagazine(12))
    }

    @Test
    fun whenMagazineA8Have12Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,3,5,7,9,11)),
            PageOfMagazine(2, mutableListOf(2,4,6,8,10,12))
        )

        Assertions.assertArrayEquals(result, magazineA8.getMagazine(12))
    }

    @Test
    fun whenMagazineA8Have13Pages() {
        val result = arrayOf(
            PageOfMagazine(1, mutableListOf(1,3,5,7,9,11,13)),
            PageOfMagazine(2, mutableListOf(2,4,6,8,10,12))
        )

        Assertions.assertArrayEquals(result, magazineA8.getMagazine(13))
    }

}