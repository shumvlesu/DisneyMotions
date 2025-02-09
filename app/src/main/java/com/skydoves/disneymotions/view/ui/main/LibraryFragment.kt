/*
 * Designed and developed by 2020 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.disneymotions.view.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.skydoves.disneymotions.R
import com.skydoves.disneymotions.base.DatabindingFragment
import com.skydoves.disneymotions.databinding.FragmentLibraryBinding
import com.skydoves.disneymotions.view.adapter.PosterLineAdapter
import org.koin.android.viewmodel.ext.android.getViewModel

class LibraryFragment : DatabindingFragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return binding<FragmentLibraryBinding>(inflater, R.layout.fragment_library, container).apply {
      viewModel = getViewModel<MainViewModel>().apply { fetchDisneyPosterList() }
      lifecycleOwner = this@LibraryFragment
      adapter = PosterLineAdapter()
    }.root
  }
}
