import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import PersoonView from '../views/PersoonView.vue'
import DemoView from '../views/DemoView.vue'
import DatumView from '../views/DatumView.vue'
import PlanningView from '../views/PlanningView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/persoon/:id',
      name: 'persoon',
      component: PersoonView,
      props: true

    },
    {
      path: '/demo/:id',
      name: 'demo',
      component: DemoView,
      props: true
    },
    {
      path: '/datum',
      name: 'datum',
      component: DatumView
    },
    {
      path: '/planning',
      name: 'planning',
      component: PlanningView
    }
  ]
})

export default router
