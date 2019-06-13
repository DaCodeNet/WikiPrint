class PrintMagazine(private val sizeOfPage: Int) {

    fun calculateNumberOfLeaf(totalPage:Int) : Int{
        var i = totalPage / sizeOfPage
        if (totalPage % sizeOfPage !=0) i++
        return i
    }

    fun getMagazine(totalPage:Int) : Array<PageOfMagazine?>
    {
        val nbMagazineLeaf = calculateNumberOfLeaf(totalPage)
        val magazine = arrayOfNulls<PageOfMagazine>(nbMagazineLeaf)
        val numberOfFreePosition = (nbMagazineLeaf * sizeOfPage)-totalPage

        println("With $totalPage pages, magazine will have $nbMagazineLeaf leaf(s), $numberOfFreePosition blank position(s)")

        for (i in 0 until nbMagazineLeaf){
            magazine[i] = PageOfMagazine(i+1)
        }

        var c = 0
        for (page in 1..totalPage){
            magazine[c]?.pagesToPrint?.add(page)
            if(c<nbMagazineLeaf-1) c++ else c=0
        }

        return magazine
    }


}