/**
 */
package experimentOntology.planning.designOfExperiment.impl;

import experimentOntology.planning.designOfExperiment.BlockDesignDiscipline;
import experimentOntology.planning.designOfExperiment.BlockedCharacteristic;
import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Design Discipline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.impl.BlockDesignDisciplineImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockDesignDisciplineImpl extends DesignDisciplineImpl implements BlockDesignDiscipline {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockedCharacteristic> block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockDesignDisciplineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignOfExperimentPackage.Literals.BLOCK_DESIGN_DISCIPLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockedCharacteristic> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<BlockedCharacteristic>(BlockedCharacteristic.class, this, DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE__BLOCK:
				return getBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends BlockedCharacteristic>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE__BLOCK:
				getBlock().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE__BLOCK:
				return block != null && !block.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockDesignDisciplineImpl
