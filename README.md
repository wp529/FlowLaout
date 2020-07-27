### FlowLaout

支持收起、展开的流式布局

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
dependencies {
	implementation 'com.github.wp529:FlowLayout:1.0.0'
}
```



| 属性                  |                                      作用 |
| :-------------------- | ----------------------------------------: |
| maxLines              |                              最大展示行数 |
| childHorizontalMargin |                            item间水平间距 |
| childHorizontalMargin |                item间垂直间距(以行为基准) |
| gravity               | left(从左往右排列) or right(从右往左排列) |



展开、收起实现方式

```
需求默认最多展示5行,超过5行的收起,点击某个按钮展开。
那么实现为初始maxLines = 5 然后展开按钮后设置maxLines = Int.MAX_VALUE
点击收起后又设置maxLines = 5
```
