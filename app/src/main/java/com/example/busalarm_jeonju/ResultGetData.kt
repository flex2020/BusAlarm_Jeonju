package com.example.busalarm_jeonju

data class ResultGetData(
    var brtStdid: String // 노선 ID
    var brsSeqno: String // 정류장순번
    var bnodeId: String // 지점ID
    var stopKname: String // 정류장 한글 명칭
    var stopId: String // 정류장서비스 ID
    var stopStandardid: String // 정류장표준ID
    var reMark: String // 비고(방향)
    var brnSeqno: String // 지점순번
    var brtSubid: String // 분선 ID
    var busLow: String // 저상유무 (1:저상)
)
