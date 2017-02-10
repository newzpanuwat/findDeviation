<html>
<head>
<title>Main.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.ln { color: #606366; font-weight: normal; font-style: normal; }
.s0 { color: rgb(204,120,50); }
.s1 { color: rgb(169,183,198); }
.s2 { color: rgb(104,151,187); }
.s3 { color: rgb(106,135,89); }
</style>
</head>
<BODY BGCOLOR="#2b2b2b">
<TABLE CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<TR><TD><CENTER>
<FONT FACE="Arial, Helvetica" COLOR="#000000">
Main.java</FONT>
</center></TD></TR></TABLE>
<pre>
<a name="l1"><span class="ln">1    </span></a><span class="s0">package </span><span class="s1">com.Stou</span><span class="s0">;</span><span class="s1"> 
<a name="l2"><span class="ln">2    </span></a></span><span class="s0">import </span><span class="s1">java.util.Scanner</span><span class="s0">;</span><span class="s1"> 
<a name="l3"><span class="ln">3    </span></a></span><span class="s0">public class </span><span class="s1">Main { 
<a name="l4"><span class="ln">4    </span></a> 
<a name="l5"><span class="ln">5    </span></a>    </span><span class="s0">public static void </span><span class="s1">main(String[] args) { 
<a name="l6"><span class="ln">6    </span></a>        </span><span class="s0">double </span><span class="s1">A[] = </span><span class="s0">new double</span><span class="s1">[</span><span class="s2">5</span><span class="s1">]</span><span class="s0">;</span><span class="s1"> 
<a name="l7"><span class="ln">7    </span></a>        Main cl = </span><span class="s0">new </span><span class="s1">Main()</span><span class="s0">;</span><span class="s1"> 
<a name="l8"><span class="ln">8    </span></a>        cl.enterData(A)</span><span class="s0">;</span><span class="s1"> 
<a name="l9"><span class="ln">9    </span></a>        cl.showData(A)</span><span class="s0">;</span><span class="s1"> 
<a name="l10"><span class="ln">10   </span></a> 
<a name="l11"><span class="ln">11   </span></a> 
<a name="l12"><span class="ln">12   </span></a> 
<a name="l13"><span class="ln">13   </span></a>    } 
<a name="l14"><span class="ln">14   </span></a>    </span><span class="s0">public void </span><span class="s1">enterData(</span><span class="s0">double </span><span class="s1">[]A) { 
<a name="l15"><span class="ln">15   </span></a> 
<a name="l16"><span class="ln">16   </span></a>        Scanner sc = </span><span class="s0">new </span><span class="s1">Scanner(System.in)</span><span class="s0">;</span><span class="s1"> 
<a name="l17"><span class="ln">17   </span></a>        </span><span class="s0">for </span><span class="s1">(</span><span class="s0">int </span><span class="s1">i = </span><span class="s2">0</span><span class="s0">; </span><span class="s1">i &lt; A.length</span><span class="s0">; </span><span class="s1">i++) { 
<a name="l18"><span class="ln">18   </span></a>            System.out.print(</span><span class="s3">&quot;Input data:&quot; </span><span class="s1">+ (i+</span><span class="s2">1</span><span class="s1">)+ </span><span class="s3">&quot; &quot;</span><span class="s1">)</span><span class="s0">;</span><span class="s1"> 
<a name="l19"><span class="ln">19   </span></a>            A[i] = sc.nextDouble()</span><span class="s0">;</span><span class="s1"> 
<a name="l20"><span class="ln">20   </span></a>        } 
<a name="l21"><span class="ln">21   </span></a>    } 
<a name="l22"><span class="ln">22   </span></a> 
<a name="l23"><span class="ln">23   </span></a>    </span><span class="s0">public double </span><span class="s1">sumData(</span><span class="s0">double </span><span class="s1">[]A){ 
<a name="l24"><span class="ln">24   </span></a>        </span><span class="s0">double </span><span class="s1">sum=</span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l25"><span class="ln">25   </span></a> 
<a name="l26"><span class="ln">26   </span></a>        </span><span class="s0">for</span><span class="s1">(</span><span class="s0">int </span><span class="s1">i =</span><span class="s2">0</span><span class="s0">;</span><span class="s1">i&lt;A.length</span><span class="s0">;</span><span class="s1">i++){ 
<a name="l27"><span class="ln">27   </span></a>            sum += A[i]</span><span class="s0">;</span><span class="s1"> 
<a name="l28"><span class="ln">28   </span></a>        } 
<a name="l29"><span class="ln">29   </span></a>        </span><span class="s0">return </span><span class="s1">sum</span><span class="s0">;</span><span class="s1"> 
<a name="l30"><span class="ln">30   </span></a>    } 
<a name="l31"><span class="ln">31   </span></a> 
<a name="l32"><span class="ln">32   </span></a>    </span><span class="s0">public double </span><span class="s1">findMax(</span><span class="s0">double </span><span class="s1">[]A) { 
<a name="l33"><span class="ln">33   </span></a>        </span><span class="s0">double </span><span class="s1">max = </span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l34"><span class="ln">34   </span></a>        </span><span class="s0">for </span><span class="s1">(</span><span class="s0">int </span><span class="s1">i = </span><span class="s2">0</span><span class="s0">; </span><span class="s1">i &lt; A.length</span><span class="s0">; </span><span class="s1">i++) { 
<a name="l35"><span class="ln">35   </span></a>            max = A[</span><span class="s2">0</span><span class="s1">]</span><span class="s0">;</span><span class="s1"> 
<a name="l36"><span class="ln">36   </span></a>            </span><span class="s0">if</span><span class="s1">(A[i] &gt; max) { 
<a name="l37"><span class="ln">37   </span></a>                max = A[i]</span><span class="s0">;</span><span class="s1"> 
<a name="l38"><span class="ln">38   </span></a>            } 
<a name="l39"><span class="ln">39   </span></a>        } 
<a name="l40"><span class="ln">40   </span></a>        </span><span class="s0">return </span><span class="s1">max</span><span class="s0">;</span><span class="s1"> 
<a name="l41"><span class="ln">41   </span></a>    } 
<a name="l42"><span class="ln">42   </span></a> 
<a name="l43"><span class="ln">43   </span></a> 
<a name="l44"><span class="ln">44   </span></a>    </span><span class="s0">public double </span><span class="s1">findMin(</span><span class="s0">double </span><span class="s1">[]A){ 
<a name="l45"><span class="ln">45   </span></a>        </span><span class="s0">double </span><span class="s1">min = </span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l46"><span class="ln">46   </span></a>        </span><span class="s0">for</span><span class="s1">(</span><span class="s0">int </span><span class="s1">i=</span><span class="s2">0</span><span class="s0">;</span><span class="s1">i&lt;A.length</span><span class="s0">;</span><span class="s1">i++) { 
<a name="l47"><span class="ln">47   </span></a>            min = A[</span><span class="s2">0</span><span class="s1">]</span><span class="s0">;</span><span class="s1"> 
<a name="l48"><span class="ln">48   </span></a>            </span><span class="s0">if</span><span class="s1">(A[i] &lt; min) { 
<a name="l49"><span class="ln">49   </span></a>                min = A[i]</span><span class="s0">;</span><span class="s1"> 
<a name="l50"><span class="ln">50   </span></a>            } 
<a name="l51"><span class="ln">51   </span></a>        } 
<a name="l52"><span class="ln">52   </span></a>        </span><span class="s0">return </span><span class="s1">min</span><span class="s0">;</span><span class="s1"> 
<a name="l53"><span class="ln">53   </span></a>    } 
<a name="l54"><span class="ln">54   </span></a> 
<a name="l55"><span class="ln">55   </span></a>    </span><span class="s0">public double </span><span class="s1">findMean(</span><span class="s0">double </span><span class="s1">[]A</span><span class="s0">,double </span><span class="s1">sum){ 
<a name="l56"><span class="ln">56   </span></a>        </span><span class="s0">double </span><span class="s1">mean = </span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l57"><span class="ln">57   </span></a>        </span><span class="s0">for</span><span class="s1">(</span><span class="s0">int </span><span class="s1">i=</span><span class="s2">0</span><span class="s0">;</span><span class="s1">i&lt;A.length</span><span class="s0">;</span><span class="s1">i++){ 
<a name="l58"><span class="ln">58   </span></a>            mean = sum/A[i]</span><span class="s0">;</span><span class="s1"> 
<a name="l59"><span class="ln">59   </span></a>        } 
<a name="l60"><span class="ln">60   </span></a>        </span><span class="s0">return </span><span class="s1">mean</span><span class="s0">;</span><span class="s1"> 
<a name="l61"><span class="ln">61   </span></a>    } 
<a name="l62"><span class="ln">62   </span></a>    </span><span class="s0">public double </span><span class="s1">findDeviation(</span><span class="s0">double </span><span class="s1">[]A</span><span class="s0">, double </span><span class="s1">mean){ 
<a name="l63"><span class="ln">63   </span></a>        </span><span class="s0">double </span><span class="s1">Deviate=</span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l64"><span class="ln">64   </span></a>        </span><span class="s0">double </span><span class="s1">Sumdeviate=</span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l65"><span class="ln">65   </span></a>        </span><span class="s0">double </span><span class="s1">E=</span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l66"><span class="ln">66   </span></a> 
<a name="l67"><span class="ln">67   </span></a>        E = A.length-mean</span><span class="s0">;</span><span class="s1"> 
<a name="l68"><span class="ln">68   </span></a>        Sumdeviate = Math.pow(E</span><span class="s0">,</span><span class="s2">2</span><span class="s1">)</span><span class="s0">;</span><span class="s1"> 
<a name="l69"><span class="ln">69   </span></a>        Deviate = Math.sqrt(Sumdeviate)</span><span class="s0">;</span><span class="s1"> 
<a name="l70"><span class="ln">70   </span></a> 
<a name="l71"><span class="ln">71   </span></a>        </span><span class="s0">return </span><span class="s1">Deviate</span><span class="s0">;</span><span class="s1"> 
<a name="l72"><span class="ln">72   </span></a> 
<a name="l73"><span class="ln">73   </span></a>    } 
<a name="l74"><span class="ln">74   </span></a> 
<a name="l75"><span class="ln">75   </span></a> 
<a name="l76"><span class="ln">76   </span></a>    </span><span class="s0">public void </span><span class="s1">showData(</span><span class="s0">double </span><span class="s1">[]A){ 
<a name="l77"><span class="ln">77   </span></a>        Main cl = </span><span class="s0">new </span><span class="s1">Main()</span><span class="s0">;</span><span class="s1"> 
<a name="l78"><span class="ln">78   </span></a>        </span><span class="s0">double </span><span class="s1">SUM</span><span class="s0">,</span><span class="s1">MAX</span><span class="s0">,</span><span class="s1">MIN</span><span class="s0">,</span><span class="s1">MEAN</span><span class="s0">,</span><span class="s1">DEVIATION=</span><span class="s2">0</span><span class="s0">;</span><span class="s1"> 
<a name="l79"><span class="ln">79   </span></a> 
<a name="l80"><span class="ln">80   </span></a>        SUM = cl.sumData(A)</span><span class="s0">;</span><span class="s1"> 
<a name="l81"><span class="ln">81   </span></a>        MAX = cl.findMax(A)</span><span class="s0">;</span><span class="s1"> 
<a name="l82"><span class="ln">82   </span></a>        MIN = cl.findMin(A)</span><span class="s0">;</span><span class="s1"> 
<a name="l83"><span class="ln">83   </span></a>        MEAN = cl.findMean(A</span><span class="s0">,</span><span class="s1">SUM)</span><span class="s0">;</span><span class="s1"> 
<a name="l84"><span class="ln">84   </span></a>        DEVIATION = cl.findDeviation(A</span><span class="s0">,</span><span class="s1">MEAN)</span><span class="s0">;</span><span class="s1"> 
<a name="l85"><span class="ln">85   </span></a> 
<a name="l86"><span class="ln">86   </span></a>        System.out.println(</span><span class="s3">&quot;Summary is &quot;</span><span class="s1">+ SUM)</span><span class="s0">;</span><span class="s1"> 
<a name="l87"><span class="ln">87   </span></a>        System.out.println(</span><span class="s3">&quot;Max is &quot;</span><span class="s1">+ MAX)</span><span class="s0">;</span><span class="s1"> 
<a name="l88"><span class="ln">88   </span></a>        System.out.println(</span><span class="s3">&quot;Min is &quot;</span><span class="s1">+ MIN)</span><span class="s0">;</span><span class="s1"> 
<a name="l89"><span class="ln">89   </span></a>        System.out.println(</span><span class="s3">&quot;MEAN is &quot;</span><span class="s1">+ MEAN)</span><span class="s0">;</span><span class="s1"> 
<a name="l90"><span class="ln">90   </span></a>        System.out.println(</span><span class="s3">&quot;DEVIATION is &quot;</span><span class="s1">+ DEVIATION)</span><span class="s0">;</span><span class="s1"> 
<a name="l91"><span class="ln">91   </span></a> 
<a name="l92"><span class="ln">92   </span></a>    } 
<a name="l93"><span class="ln">93   </span></a>} 
<a name="l94"><span class="ln">94   </span></a></span></pre>
</body>
</html>