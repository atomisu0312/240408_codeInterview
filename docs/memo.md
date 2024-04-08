## 読んで欲しい人
- 諦めない人
- 喜怒をきちんと読む
- https://horstmann.com/presentations/2024/algorithms/#(1)

## コンセプト
- Keep at it until you learn it
- 自分のペースでやること
- 準備ができてから次に進め
- 集中こそ全て
- Khan Academy approach

## ch1 Basic Array Algorithm
- Sum Max Min
  - 走査しないとだめなんよ
- これはいわゆるLinear Searchというやつだよ
  - しらみつぶしに探していく
- Binary Search
  - ソートして半分に割っていくあれ
- https://www.interactivities.ws/ebook-bjeo-7-ch14-sec06-algosim-1.xhtml

## ch3 Sorting 
- selection sortがいつものイマイチなやつ
  - 要素数が10個であれば、100回以上の演算を行う羽目になる
  - n^2 + n -2
- Merge Sort
  - まずは半分に分ける
  - それぞれの半数をソートする
  - んで比較していく
  - 要素数が100であれば
    -  50 + 50 : Read & 100 Write
  - ちなみに分割を重ねても数は変わらない
-  https://www.interactivities.ws/ebook-bjeo-7-ch14-sec06-algosim-1.xhtml

## ch4 Linked List
- Linked Lists
  - なんか繋がっているやつ
  - 面接でよく出るのはこれ❤️
  - https://horstmann.com/presentations/2024/algorithms/#(1)
  - Adding Element
  - 実際にやってみよう
- Collectionには以下のメソッドがある
  - next
  - hasNext
  - previous
  - hasPrevious
  - add
  - remove
  - set
- iteratorの方向についてきちんと理解しないといけなさそう
- 一回操作したものに対して再度操作するのはめんどくさい
- next自体も効率的にできるはず
- removeに関するサンプルは次のとおり
  - https://www.interactivities.ws/ebook-bjeo-6-ch16-sec01-int1-4.xhtml

- setとは
  - isAfterNextはnextが呼び出された後を示すフラグである。
  - addの後にはfalseになるけど、これによりnextを呼ぶことを強制することができる
## ch5 hashSet
- hashSetとは
  - あるオブジェクトを決まった長さのものに放り込むこと
  - Colligion: 違う元から同じhashが作られること
  - HashSetの練習がやばい
    - https://www.interactivities.ws/ebook-bjeo-6-ch16-sec04-int1-1.xhtml
   - HashSetは練習しておきたいかな？
   - ちなみに順序にとらわれない点に注意
   - ガベージコレクタの仕組みがようわからん
   - HashSetを使いこなせたら嬉しいね
   - JavaのHashSetについてしらべてみましょう 
- hashListについても見といた方がいい？
  - アルゴリズム(next, search, iterration等)の速度や効率性に違いが現れます
## ch6 BTree
- できる機能は以下の通り
  - insert
  - delete
- Binary Search Tree
  - インデックスとかに使われそう
  - なお内容はクッソ楽（https://horstmann.com/codecheck/examples/bstinsert1.html）

  - 削除が少しめんどくさい

## ch7 Graphs
- minimum spannning tree (最小グラフだっけ？)
  - https://horstmann.com/codecheck/examples/prim.html
- ダイキストラ法
　- https://horstmann.com/codecheck/examples/dijkstra.html

- 教授はひたすらこのアルゴリズムを組んでいたらしい？すげぇ