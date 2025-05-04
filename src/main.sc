require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнем

    state: /hello
        intent!: /привет
        a: Привет!
    
    state: /weather
            q!: * ~прогноз * ~погода *
            q!: * ~погода *
            q!: * ~прогноз *
            a: Погода будет хорошая
    
    state: /currency
            q!: * ~прогноз * ~валюта *
            q!: * ~курс * ~валюта *
            q!:*~валюта *
            q!: * ~курс *
            a: Доллар 82 рубля, евро 93 рубля

    state: /NoMatch
        event!: noMatch
        a: Я вас не понял :(

    state: Match
        event!: match
        a: {{$context.intent.answer}}

