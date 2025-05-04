require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнем

    state: /hello
        intent!: /привет
        a: Привет!

    state: /NoMatch
        event!: noMatch
        a: Я вас не понял.

    state: Match
        event!: match
        a: {{$context.intent.answer}}

        
theme: /WeatherForecast
        
        state: /weather
            q!: * ~прогноз * ~погода *
            q!: * ~погода *
            q!: * ~прогноз *
            q!: *будет [осадк*/~дождь/~снег/~град]*
            a: Сегодня солнечно
        
theme: /Banking
        
        state: /currency
            q!: * ~прогноз * ~валюта *
            q!: * ~курс * ~валюта *
            q!:*~валюта *
            q!: * ~курс *
            a: Доллар 74 рубля, евро 98 рублей

