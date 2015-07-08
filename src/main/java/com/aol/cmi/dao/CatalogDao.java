package com.aol.cmi.dao;

import java.util.List;

import com.aol.cmi.model.ContentBlock;
import com.aol.cmi.model.ProductSummary;

public interface CatalogDao {
	/**
	 * Get Product given id
	 * @param id
	 * @return
	 */
	ProductSummary getProduct(String id);

	/**
	 * Get cms block given the id
	 * @param id
	 * @return
	 */
	ContentBlock getCmsBlock(String id);

	/**
	 * Get multiple cms blocks that start with the given prefix
	 * @param prefix
	 * @return
	 */
	List<ContentBlock> getCmsBlocks(String prefix);

	/**
	 * Get upsell products
	 * @param id
	 * @return
	 */
	List<ProductSummary> getUpsellProducts(String id);

}
