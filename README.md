## Scala Kansai Summit 2015

http://summit.scala-kansai.org/

【ハンズオン】Skinny Framework 2.0 で試すお手軽 Scala Web アプリ開発 瀬良 和弘 定員：20名

## Skinny Framework を使ってみよう

Skinny Framework の最新の安定版は 1.3.19 ですが、現在主に非同期処理サポートを強化した 2.0 の開発中です。

## セットアップ

セットアップはとても簡単です。

## 必要なもの

- JDK 7 以上

### 1.3.19 を使う方

Mac OS X をお使いの方は Homebrew が簡単です。

```
brew update
brew install skinny
skinny new hello-skinny
```

それ以外の環境の方はここにある skinny-blank-app-with-deps.zip をダウンロードしてください。

https://github.com/skinny-framework/skinny-framework/releases/tag/1.3.19

```
cd hello-skinny
skinny run
```

で http://localhost:8080/ にアクセスして画面が表示されればセットアップ完了。

が一般的な手順ですが、会場のネットワーク環境の都合上、内部に設置されたファイルサーバから skinny-blank-app-with-deps.zip をダウンロードしていただくことになるので、会場でご案内します。

### 2.0.0.M3 を使う方

Homebrew では 1.3.x を提供しているので GitHub のリリースページに行って zip ファイルを入手してください。

https://github.com/skinny-framework/skinny-framework/releases/tag/2.0.0.M3

が一般的な手順ですが、会場のネットワーク環境の都合上、内部に設置されたファイルサーバから skinny-blank-app-with-deps.zip をダウンロードしていただくことになるので、会場でご案内します。


## やってみること

1 時間という限られた時間ですので、初めて Scala をやってみるという方は以下のようなところから始めてみてください。

ある程度慣れている方は開発者である私を捕まえていろいろ質問などしていただければと思います。

### scaffold で CRUD を作ってみよう

生成された README.md や公式サイトに手順があるのでやってみましょう。

サンプルもいくつかありますので見てみてください。

https://github.com/skinny-framework

特に scaffold で生成された controller を見ても次に何をすればいいか迷ってしまうと思うので、こちらも参考にしてみてください。

https://github.com/skinny-framework/skinny-framework-example/blob/master/src/main/scala/controller/CompaniesController.scala

### Skinny 2.0 で Future を使ったコードを書いてみよう

今日の私のセッションの内容を踏まえて Future を返すライブラリを使ったコードを Skinny で書いてみましょう。

### skinny-engine-server で Sinatra 的に気軽に Web サーバ立ち上げてみよう

skinny-engine-blank-app.zip を解凍して中身を触ってみてください。これについてはあまりドキュメントがないので、わからないところがあれば聞いてください。

