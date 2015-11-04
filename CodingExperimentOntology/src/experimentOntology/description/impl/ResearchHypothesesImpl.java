/**
 */
package experimentOntology.description.impl;

import experimentOntology.description.DescriptionPackage;
import experimentOntology.description.ResearchHypotheses;
import experimentOntology.description.SimpleHypothesis;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Hypotheses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.impl.ResearchHypothesesImpl#getHypotheses <em>Hypotheses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchHypothesesImpl extends MinimalEObjectImpl.Container implements ResearchHypotheses {
	/**
	 * The cached value of the '{@link #getHypotheses() <em>Hypotheses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypotheses()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleHypothesis> hypotheses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchHypothesesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.RESEARCH_HYPOTHESES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleHypothesis> getHypotheses() {
		if (hypotheses == null) {
			hypotheses = new EObjectContainmentEList<SimpleHypothesis>(SimpleHypothesis.class, this, DescriptionPackage.RESEARCH_HYPOTHESES__HYPOTHESES);
		}
		return hypotheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.RESEARCH_HYPOTHESES__HYPOTHESES:
				return ((InternalEList<?>)getHypotheses()).basicRemove(otherEnd, msgs);
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
			case DescriptionPackage.RESEARCH_HYPOTHESES__HYPOTHESES:
				return getHypotheses();
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
			case DescriptionPackage.RESEARCH_HYPOTHESES__HYPOTHESES:
				getHypotheses().clear();
				getHypotheses().addAll((Collection<? extends SimpleHypothesis>)newValue);
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
			case DescriptionPackage.RESEARCH_HYPOTHESES__HYPOTHESES:
				getHypotheses().clear();
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
			case DescriptionPackage.RESEARCH_HYPOTHESES__HYPOTHESES:
				return hypotheses != null && !hypotheses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResearchHypothesesImpl
