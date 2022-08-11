function NumberofWaterTanks(str) {
    let count = 0
    let pairArr = []
    let newPair = []
    if (str.length == 0 | | str.length == 1) {
        return -1
    }
    let countHifen = 0
    let countH = 0
    for (let i=0
         i < str.length
         i++) {
        if (str[i] == "-") {
            countHifen++
        }
        if (str[i] == "H") {
            countH++
        }
    }
    if (countHifen < Math.round(countH / 2)) {
        return -1
    }
    for (let i=0
         i < str.length
         i++) {
        if (str[i] == "H") {
            pairArr.push(i)
        }
        if (pairArr.length == 2) {
            newPair.push(pairArr)
            pairArr = []
            i--
        }
    }
    for (let j=1
         j < newPair.length
         j++) {
        if (newPair[j - 1][1] - newPair[j - 1][0] > 1) {
            count++
        }
        if (newPair[j - 1][1] == newPair[j][0]) {
            continue
        }
    }
    if (newPair[newPair.length - 1][1] < str.length - 1) {
        count++
    }
    if (count == 0) {
        return -1
    }
    return count
}
