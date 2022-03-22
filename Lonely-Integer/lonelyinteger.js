function lonelyinteger(a) {
    var lonely;
    for (let i = 0; i < a.length; i++) {
        var unique_check = a[i];
        var count_same= 0;
        for(let j = 0; j<a.length; j++){
            if(unique_check == a[j]){
                count_same++;
            }
        }
        if(count_same == 1){
            lonely = unique_check;
        }
    }
    return lonely;

}

