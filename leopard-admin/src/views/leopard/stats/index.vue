<template>
  <div style="width: 100%">
    <DocTree />
    <a-flex vertical gap="large">
      <a-flex justify="space-between" align="center" :gap="20">
        <a-card style="width: 20%"  >
          <a-statistic align="center" title="今日创建" :value="stats.todayCreateUrl" style="margin-right: 50px">
            <template #suffix>
              <like-outlined />
            </template>
          </a-statistic>
        </a-card>
        <a-card style="width: 20%"  >
          <a-statistic align="center" title="短链总数" :value="stats.urlTotalCount" style="margin-right: 50px">
            <template #suffix>
              <like-outlined />
            </template>
          </a-statistic>
        </a-card>

        <a-card style="width: 20%" >
          <a-statistic
              title="今日访问量"
              :value="11.28"
              :precision="2"
              suffix="%"
              :value-style="{ color: '#3f8600' }"
              style="margin-right: 50px"
          >
            <template #prefix>
              <arrow-up-outlined />
            </template>
          </a-statistic>
        </a-card>
        <a-card style="width: 20%" >
          <a-statistic
              title="总访问量"
              :value="11.28"
              :precision="2"
              suffix="%"
              :value-style="{ color: '#3f8600' }"
              style="margin-right: 50px"
          >
            <template #prefix>
              <arrow-up-outlined />
            </template>
          </a-statistic>
        </a-card>
        <a-card style="width: 20%" >
          <a-statistic
              title="今日访问人数"
              :value="9.3"
              :precision="2"
              suffix="%"
              class="demo-class"
              :value-style="{ color: '#cf1322' }"
          >
            <template #prefix>
              <arrow-down-outlined />
            </template>
          </a-statistic>
        </a-card>
      </a-flex>
      <a-flex justify="space-between" align="center" :gap="20">


      </a-flex>

    <LineChart/>
    </a-flex>
  </div>
</template>

<script lang="ts" setup>
import { LikeOutlined,ArrowUpOutlined, ArrowDownOutlined } from '@ant-design/icons-vue'

import LineChart from "@/components/echart/line/index.vue";
import DocTree from "@/components/doc-tree/index.vue";
import {reactive} from "vue";


const stats=reactive({
  todayCreateUrl:100,
  urlTotalCount:212
})
</script>

<style scoped>

</style>
