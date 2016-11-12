# map-performancetest

Performance test map access vs method access


## Results:


### PerformanceStringTest: Run complete. Total time: 00:28:28

| Benchmark                                                 | Mode   | Cnt     | Score     | Error  | Units  |
|-----------------------------------------------------------|--------|---------|-----------|--------|--------|
| performanceMap1000000Access         | thrpt  | 100     | 138.950 ± | 1.056  | ops/us |
| performanceMap1000000Size1000Access | thrpt  | 100     | 137.758 ± | 1.059  | ops/us |
| performanceMapAccess                | thrpt  | 100     | 108.680 ± | 0.992  | ops/us |
| performanceMethodAccess             | thrpt  | 100     | 331.503 ± | 3.865  | ops/us |
| performanceMap1000000Access         | avgt   | 100     | 0.007 ±   | 0.001  | us/op  |
| performanceMap1000000Size1000Access | avgt   | 100     | 0.007 ±   | 0.001  | us/op  |
| performanceMapAccess                | avgt   | 100     | 0.009 ±   | 0.001  | us/op  |
| performanceMethodAccess             | avgt   | 100     | 0.003 ±   | 0.001  | us/op  |
| performanceMap1000000Access         | sample | 1031080 | 0.034 ±   | 0.001  | us/op  |
| performanceMap1000000Size1000Access | sample | 1038788 | 0.034 ±   | 0.001  | us/op  |
| performanceMapAccess                | sample | 1696308 | 0.037 ±   | 0.001  | us/op  |
| performanceMethodAccess             | sample | 1687930 | 0.029 ±   | 0.001  | us/op  |
| performanceMap1000000Access         | ss     | 100     | 5.807 ±   | 0.605  | us/op  |
| performanceMap1000000Size1000Access | ss     | 100     | 5.746 ±   | 0.600  | us/op  |
| performanceMapAccess                | ss     | 100     | 6.139 ±   | 1.290  | us/op  |
| performanceMethodAccess             | ss     | 100     | 4.399 ±   | 0.552  | us/op  |

### PerformanceLongTest: Run complete. Total time: 00:38:15

| Benchmark                                                 | Mode   | Cnt     | Score     | Error  | Units  |
|-----------------------------------------------------------|--------|---------|-----------|--------|--------|
| performanceMap1000000Access           | thrpt  | 100     | 109.045 ± | 13.090 | ops/us |
| performanceMap1000000Size1000Access   | thrpt  | 100     | 100.032 ± | 13.399 | ops/us |
| performanceMapAccess                  | thrpt  | 100     | 108.503 ± | 13.104 | ops/us |
| performanceMethodAccess               | thrpt  | 100     | 243.235 ± | 32.276 | ops/us |
| performanceMap1000000Access           | avgt   | 100     | 0.011 ±   | 0.002  | us/op  |
| performanceMap1000000Size1000Access   | avgt   | 100     | 0.011 ±   | 0.002  | us/op  |
| performanceMapAccess                  | avgt   | 100     | 0.011 ±   | 0.002  | us/op  |
| performanceMethodAccess               | avgt   | 100     | 0.005 ±   | 0.001  | us/op  |
| performanceMap1000000Access           | sample | 1467532 | 0.043 ±   | 0.001  | us/op  |
| performanceMap1000000Size1000Access   | sample | 1338417 | 0.048 ±   | 0.001  | us/op  |
| performanceMapAccess                  | sample | 1408354 | 0.045 ±   | 0.001  | us/op  |
| performanceMethodAccess               | sample | 1211290 | 0.039 ±   | 0.001  | us/op  |
| performanceMap1000000Access           | ss     | 100     | 6.360 ±   | 0.602  | us/op  |
| performanceMap1000000Size1000Access   | ss     | 100     | 6.729 ±   | 0.805  | us/op  |
| performanceMapAccess                  | ss     | 100     | 6.934 ±   | 0.746  | us/op  |
| performanceMethodAccess               | ss     | 100     | 4.397 ±   | 0.423  | us/op  |

