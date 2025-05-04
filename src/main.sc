require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: /hello
        q!: привет
        a: Привет!
        
    state: /weather
        q!: прогноз погоды
        a: Сегодня солнечно
        
    state: /currency
        q!: курс валют
        a: Доллар 74 рубля, евро 97 рублей

    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

