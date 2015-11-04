/**
 */
package experimentOntology.planning.impl;

import experimentOntology.planning.DualTreatmentFactor;
import experimentOntology.planning.PlanningPackage;
import experimentOntology.planning.TernaryFactorPlan;

import experimentOntology.planning.designOfExperiment.TriFactorDesign;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Factor Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.impl.TernaryFactorPlanImpl#getFactors <em>Factors</em>}</li>
 *   <li>{@link experimentOntology.planning.impl.TernaryFactorPlanImpl#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TernaryFactorPlanImpl extends ExperimentalPlanImpl implements TernaryFactorPlan {
	/**
	 * The cached value of the '{@link #getFactors() <em>Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<DualTreatmentFactor> factors;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected TriFactorDesign design;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TernaryFactorPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanningPackage.Literals.TERNARY_FACTOR_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DualTreatmentFactor> getFactors() {
		if (factors == null) {
			factors = new EObjectContainmentEList<DualTreatmentFactor>(DualTreatmentFactor.class, this, PlanningPackage.TERNARY_FACTOR_PLAN__FACTORS);
		}
		return factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriFactorDesign getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(TriFactorDesign newDesign, NotificationChain msgs) {
		TriFactorDesign oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(TriFactorDesign newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanningPackage.TERNARY_FACTOR_PLAN__FACTORS:
				return ((InternalEList<?>)getFactors()).basicRemove(otherEnd, msgs);
			case PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN:
				return basicSetDesign(null, msgs);
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
			case PlanningPackage.TERNARY_FACTOR_PLAN__FACTORS:
				return getFactors();
			case PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN:
				return getDesign();
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
			case PlanningPackage.TERNARY_FACTOR_PLAN__FACTORS:
				getFactors().clear();
				getFactors().addAll((Collection<? extends DualTreatmentFactor>)newValue);
				return;
			case PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN:
				setDesign((TriFactorDesign)newValue);
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
			case PlanningPackage.TERNARY_FACTOR_PLAN__FACTORS:
				getFactors().clear();
				return;
			case PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN:
				setDesign((TriFactorDesign)null);
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
			case PlanningPackage.TERNARY_FACTOR_PLAN__FACTORS:
				return factors != null && !factors.isEmpty();
			case PlanningPackage.TERNARY_FACTOR_PLAN__DESIGN:
				return design != null;
		}
		return super.eIsSet(featureID);
	}

} //TernaryFactorPlanImpl
