require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: /hello
        intent!: /привет
        a: Привет!

    state: /weather
        intent!: /прогноз
        a: Сегодня солнечно
        
    state: /currency
        intent!: /курс
        a: Доллар 74 рубля, евро 97 рублей

    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}